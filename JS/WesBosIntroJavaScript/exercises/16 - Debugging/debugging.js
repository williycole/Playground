const people = [
    { name: 'Wes', cool: true, country: 'Canada' },
    { name: 'Scott', cool: true, country: 'Merica' },
    { name: 'Snickers', cool: false, country: 'Dog Country' },
  ];
  
  people.forEach((person, index) => {
    console.log(person.name);
  });
  
  // ==========*****(Console Methods*****)==========
  // people.forEach((person, index) => {
  //   console.log(person.name);
  // });
  
  //===========

  // people.forEach((person, index) => {
  //   console.info(person.name);
  // });
  
  //===========

  // people.forEach((person, index) => {
  //   console.error(person.name);
  //   console.warn(person.name);
  // }); //these two just changes what it looks like in the console
 
 //===========

  //console.table(people);
  // console.table is really usfule, it formats your object into a table
  
  //===========

  //console.count();
  //this one counts how many times a function  or whatever you pass it runs
  
  //===========

  //console.groupCollapsed() 
  //this helps you group a lot of stuff together it's very useful
  
  //console.groupCollapsed()
  //console.log(some stuff)
  //console.log(some more stuff)
  //console.groupEnd()
  
  // ==========(Callstack)==========
  // or stack trace
  // see error in greet function

  // ==========(Grabbing Elements)==========
  //$0 when select a element with inspector yu can use $0 in console to
  //see more about the element you selected
  //there is also $ and $$, thes allow us to select elements in the dom
  //ex.-- $('p') will give us the first element that matches p that
  //ex.-- $$('p') will give us all the elements that match p 
  
  // ==========(*****Breakpoints*****)==========
  //debugger; 
  //
  //is used in the console in your code where you 
  //want to stop JS from running so you can trouble shoot
  //breakpoints are good for when you have a lot going on in 
  //the console
  //
  //you can also click on the columns in the source tab on the console
  //to set debuggers 

  // ==========(Scope)==========
  // scope will allow us to peer into what variables are

  // ==========(*****Network Requests*****)==========
  //These can be seen on the network tab in the console
  //this one was pretty cool

  // ==========(Break On `Attribute)==========
  //
  //when you are trying to figure out where a certain javascript
  //code is coming from to make something do something all you have
  //to do is right click on it in the elements Tab/inspector and click 
  //break on, this will set a break point on the JS of the element you
  //selected
  //
  // ==========(Some Setup Code)==========
  
  function doctorize(name) {
    return `Dr. ${name}`;
  }
  
  function greet(name) {
    doesntExist(); //here is the error
    return `Hello ${name}`;
  }
  
  function go() {
    const name = doctorize(greet('Wes'));
    console.log(name);
  }
  
  const button = document.querySelector('.bigger');
  button.addEventListener('click', function(e) {
    const newFontSize =
      parseFloat(getComputedStyle(e.currentTarget).fontSize) + 1;
    e.currentTarget.style.fontSize = `${newFontSize}px`;
  });
  
  // A Dad joke fetch
  async function fetchDadJoke() {
    const res = await fetch('https://icanhazdadjoke.com/', {
      headers: {
        Accept: 'text/plain',
      },
    });
    const joke = await res.text();
    console.log(joke);
    return joke;
  }