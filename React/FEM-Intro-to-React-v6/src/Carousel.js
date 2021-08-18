import { Component } from "react";

class Carousel extends Component {
  state = { active: 0 };
  //static makes this able to be read from the abstract class
  static defaultProps = {
    images: ["http://pets-images.dev-apis.com/pets/none.jpg"],
  };

  handleIndexClick = (event) => {
    console.log(this);
    this.setState({
      //comes back as a string so +event.target.dataset.index handles that issue
      active: +event.target.dataset.index,
    });
  };

  render() {
    const { active } = this.state; //state is mutable, only by the component that contains it
    const { images } = this.props; //props is data flowing down, it is state from the parent

    return (
      <div className="carousel">
        <img src={images[active]} alt="animal" />
        <div className="carousel-smaller">
          {images.map((photo, index) => (
            //This should be a button so screen readers can handle the onClick
            <img
              key={photo}
              src={photo}
              data-index={index}
              onClick={this.handleIndexClick.bind(this)}
              className={index === active ? "active" : ""}
              alt="animal thumbnails"
            />
          ))}
        </div>
      </div>
    );
  }
}

export default Carousel;
