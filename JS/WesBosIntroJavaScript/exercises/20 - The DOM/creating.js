////let element = document.createElement(tagName);
//// This is the most basic way of creating html, it is not on the page yet but stored in memory

////myParagraph
const myParagraph = document.createElement('p');
myParagraph.textContent ='Yo yo yo I am a p';//// how we add text to our new p tag
myParagraph.classList.add('specail');

////myImage
const myImage = document.createElement('img');
myImage.src = 'https://picsum.photos/500';
myImage.alt = 'Nice Photo';

////myDiv
const myDiv = document.createElement('div');
myDiv.classList.add('wrapper');

////append paragraph and image to div, div to body
myDiv.appendChild(myParagraph);
myDiv.appendChild(myImage);
myDiv.style.display = 'flex';
myDiv.style.flexDirection = 'column';
myDiv.style.justifyContent = 'center';
myDiv.style.alignContent = 'center';
myDiv.style.textAlign = 'center';
myDiv.style.background = 'none';
////keep main append at bottom for smoother reflow
document.body.appendChild(myDiv);



////append to body
// document.body.appendChild(myParagraph);////method adds a node to the end of the list of children of the parent node
//// there is also node.Append()

//// there is also insertAdjacentElement()
//// ex oh shoot add heading to top
const heading = document.createElement('h2');
heading.textContent = 'Some cool stuff';
myDiv.insertAdjacentElement('afterbegin', heading);


////mini exercise
const myUl = document.createElement('ul');
const li1 = document.createElement('li');
li1.textContent = 'li1';
const li2 = document.createElement('li');
li2.textContent = 'li2';
const li3 = document.createElement('li');
li3.textContent = 'li3';
const li4 = document.createElement('li');
li4.textContent = 'li4';
const li5 = document.createElement('li');
li5.textContent = 'li5';

myDiv.insertAdjacentElement('afterbegin', myUl);
myUl.insertAdjacentElement('afterend', li1);
myUl.insertAdjacentElement('beforeend', li2);
myUl.insertAdjacentElement('beforebegin', li3);
myUl.insertAdjacentElement('afterend', li4);
myUl.insertAdjacentElement('afterbegin', li5);




