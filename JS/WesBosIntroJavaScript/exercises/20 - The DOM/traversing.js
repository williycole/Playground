const wes = document.querySelector('.wes');

// console.log(wes.children);

////$0 in the console can be used after slecting elements on the page, this will let you do things like
////$0.parentElement this could be really useful when trying to figure out how or where to place elements with js & templating

////these are element selectors
// console.log(wes.firstElementChild);
// console.log(wes.lastElementChild);
// console.log(wes.previousElementSibling);
// console.log(wes.nextElementSibling);
// console.log(wes.parentElement);
////there are also node selectors

// console.log(wes.childNodes);

const p = document.createElement('p');
p.textContent = 'I will be removed';
document.body.appendChild(p);

p.remove();
console.log(p);////here we can see its still in memory and we put it back in below
document.body.appendChild(p);
