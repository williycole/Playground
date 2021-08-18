import { Component } from "react";
import { Link, Redirect } from "react-router-dom";

// you can only address error boundaries with component classes

class ErrorBoundary extends Component {
  state = { hasError: false, redirect: false };
  static getDerivedStateFromError(e) {
    return { hasError: true };
  }
  componentDidCatch(error, info) {
    //Should Log this to Sentry, Azure Monitor, or New Relic, TrackJS etc...
    console.error("ErrorBoundary caught and error", error, info);
    setTimeout(() => this.setState({ redirect: true }), 5000);
  }
  render() {
    if (this.setState.redirect) {
      return <Redirect to="/" />;
    } else if (this.state.hasError) {
      return (
        <h2>
          This Listing has an error.<Link to="/">Click Here</Link>to go back to
          the home page or wait five seconds.
        </h2>
      );
    }
    return this.props.children;
  }
}
export default ErrorBoundary;
