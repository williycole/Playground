//document.querySelectorAll('button');
//--this would select all the buttons on the page

//document.querySelectorAll('button.attack-button');
//--this would select all the buttons on the page
//--that have a class of attack-button

//doucment.querySelector();
//document.querySelectorAll();

//--these two are basically all you need and you
//--should actually try to just use these

//console.dir() gives you info about the tag
//--all the objects, it gives you a lot of good info
//--that can be used when you are trying to work with the element

// textContent gets all of the elements, including
// style and script elements
//innerText is aware of css stylings
//innerHTML only grabs human readable elements

//insertAdjacentText is a good way to tack text onto the end of something
//--it also can make the load a little faster

//nodes, everything is a node
//an element is something that is wrapped in a tag

//Classes!
//const pic = document.querySelector('.nice');
//console.log(pic.classList)
//this would give you the _proto_ in the console.
//it tells you all the methods you can use on the class


//-------Video 23 The Dom-Working with classes-------
// is areally good for animaitons
//**** */.classList.toggle() can toggle the class, its good
//for animations and events, classList is super handy

/////------PROJECT NOTES
// function toggleCharacterPosition(){
//     charcterImg.classlist.toggle('my css animation that moves the character');
// }
// characterImg.addEventListener('mousedown', moveCharacter)

// moveCharacter.addEventListener('mousedown', function(){
//     //run function that runs cpu choice and moves
//     //that character
// });
/////------PROJECT NOTES


//.contains() is good as seeing true or false for other stuff
//donts say picture in alt tags just say it like Cute pup
//versus picture of a cute pup

// document.createElement is the easiest way to create html

//.insertAdjacentElement('where it goes', theElement);
//--this is really good for putting in elements and deciding
//--where you want them to go