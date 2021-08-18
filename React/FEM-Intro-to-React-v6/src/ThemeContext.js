import { createContext } from "react";

//have to use an empty function second because the second thing always in use state is a function
//this also is a set up for TypeScript
const ThemeContext = createContext(["green", () => {}]);

export default ThemeContext;
