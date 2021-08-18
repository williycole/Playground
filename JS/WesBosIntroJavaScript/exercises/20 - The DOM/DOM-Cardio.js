// Make a div
const myDiv = document.createElement('div');
// add a class of wrapper to it
myDiv.classList.add('wrapper');
// put it into the body
document.body.appendChild(myDiv);
myDiv.style.background = 'purple';
// make an unordered list
const myUl = document.createElement('ul');
myDiv.appendChild(myUl);

// add three list items with the words "one, two three" in them
const li1 = document.createElement('li');
const li2 = document.createElement('li');
const li3 = document.createElement('li');
// put that list into the above wrapper & and append
li1.textContent = "one";
myUl.appendChild(li1);
li2.textContent = "two";
myUl.appendChild(li2);
li3.textContent = "three";
myUl.appendChild(li3);
// create an image
const myImg = document.createElement('img');

// set the source to an image
myImg.src = 'https://source.unsplash.com/random/';
// set the width to 250
myImg.style.width = '250px';
// add a class of cute
myImg.classList.add('cute');
// add an alt of Cute Puppy
myImg.alt = "cute pup";
// Append that image to the wrapper
myDiv.insertAdjacentElement('afterbegin', myImg);

// with HTML string, make a div, with two paragraphs inside of it
// put this div before the unordered list from above
const myHtmlString = `
    <div class="innerDiv">
        <p>Paragraph One</p>
        <p>Paragraph Two</p>
    </div>
`;
myUl.insertAdjacentHTML('afterbegin', myHtmlString);
// add a class to the second paragraph called warning
const innerDivDiv = myDiv.querySelector('.innerDiv');
console.log(innerDivDiv);
console.log(innerDivDiv.children);
innerDivDiv.children[1].classList.add('warning');
// remove the first paragraph
innerDivDiv.firstElementChild.remove();

// create a function called generatePlayerCard that takes in three arguments: name, age, and height
// have that function return html that looks like this:
// <div class="playerCard">
//   <h2>NAME — AGE</h2>
//   <p>They are HEIGHT and AGE years old. In Dog years this person would be AGEINDOGYEARS. That would be a tall dog!</p>
// </div>
const generatePlayerCard = (name, age, height) => {
    const playerCardMain =`
       <div class="playerCard">
         <h2>${name} — ${age}</h2>
         <p>They are ${height} and ${age} years old. In Dog years this person would be ${age * 7}. That would be a tall dog!</p>
         <button class="delete" type="button">&times Delete</button>
       </div>
    `;
    return playerCardMain;
}

// make a new div with a class of cards
// Have that function make 4 cards
// append those cards to the div
const cardsDiv = document.createElement('div');
cardsDiv.classList.add('cards');
// cardsDiv.style.background = "teal";

let cards = generatePlayerCard("Cole", 28, "5'6");
    cards += generatePlayerCard("Madison", 25, "4'11");
    cards += generatePlayerCard("Colin", 10, "4'6");
    cards += generatePlayerCard("Greg", 55, "5'7");
    cardsDiv.insertAdjacentHTML('afterbegin', cards);

    // put the div into the DOM just before the wrapper element
    myDiv.insertAdjacentElement('beforebegin', cardsDiv);
    // Bonus, put a delete Button on each card so when you click it, the whole card is removed
// select all the buttons!
const buttons = document.querySelectorAll('.delete');
// console.log(buttons);
// make out delete function
function deleteMe(event){
        console.log(event.currentTarget)
        console.log('it workedsss')
        event.currentTarget.parentElement.style.display = "none";
}

// deleteMe();
// loop over them and attach a listener
buttons.forEach(button => button.addEventListener('click', deleteMe));