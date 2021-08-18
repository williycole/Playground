import { Link } from "react-router-dom";

// const Pet = (props) => {
//   return React.createElement("div", {}, [
//     //How props comes into play => instead of having to make three elements for each animal we just use props
//     //props are passed from parent component to child component as a way of scaffolding out your  components
//     React.createElement("h2", {}, props.name), // React.createElement("h2", {}, "Luna")
//     React.createElement("h3", {}, props.animal), //React.createElement("h3", {}, "Dog")
//     React.createElement("h3", {}, props.breed), //React.createElement("h3", {}, "Havanese"
//   ]);
// };

// This is JSX, when this gets run through babel, it transpiles into the basic Javascript above^^^^
// const Pet = (props) => {
//   return (
//     <div>
//       <h2>{props.name}</h2>
//       <h3>{props.animal}</h3>
//       <h3>{props.breed}</h3>
//     </div>
//   );
// };

//Which you can handle even further with destructuring
const Pet = (props) => {
  const { name, animal, breed, images, location, id } = props;

  let hero = "http://pets-images.dev-apis.com/pets/none.jpg";
  if (images.length) {
    hero = images[0];
  }

  return (
    <Link to={`/details/${id}`} className="pet">
      <div className="image-container">
        <img src={hero} alt={name} />
      </div>
      <div className="info">
        <h1>{name}</h1>
        <h2>{`${animal} — ${breed} — ${location}`}</h2>
      </div>
    </Link>
  );
};

export default Pet;
