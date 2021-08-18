
////This is bascially how templating works in most frameworks
// console.log('it works');
const item = document.querySelector('.item');
const width = 500;
const src = `http://picsum.photos/${width}`;
const desc = "cute pic";
const myHTML = `
    <div class="wrapper">
        <h1>Hey ya guys how's it going</h1>
        <h2>Cute Pic</h2>
        <img src="${src}" alt="${desc}"
    </div>
    `;
////turn a string into a dom element-------A GOOD WAY AROUND THE CAVEATS
const myFragment = document.createRange().createContextualFragment(myHTML);
document.body.appendChild(myFragment);
// console.log(myFragment.querySelector('img'));
// console.log(myFragment);
// item.innerHTML = myHTML;
// console.log(item.innerHTML);

/*****
 * Cross Site Scripting Security Issue
 *
 *  only security pitfalls of this is that someone could dump html into
 *  a page by making mabye something like a user name that is actually html tags
 *  this becomes a proble with xss-cross site scripting, ex. you could put a script tag
 *  as your last name for sigining into a bank account and drain someones bank account
 *
 * ////EXAMPlE//const desc = `Cute Pup <img onload="alert('HACKED')" src="https://picsum.photos/50"/>`;
*****/






////--------CAVEATS
// console.log(myHTML);////This shows that our html is just a string and not an element
////Since this is the case you can not do things like --- myHTML.classList.add('special');
////bc is is a string instead of an actual html element
////---in order to be able to add a new class you must first have your string dumped into the dom
// const itemImage = document.querySelector('.wrapper img');////here we now grab that image and below add a new class
// itemImage.classList.add('round');
// console.log(itemImage);






