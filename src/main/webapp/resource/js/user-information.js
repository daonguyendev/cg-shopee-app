function showHideList() {
    let list = document.querySelectorAll(".person-body-container-nav-body-item2-item-listItem");
    if (list[0].style.display == "none" || list[0].style.display == "") {
        console.log(list[0].style.display);
        list.forEach(element => {
            element.style.display = "flex";
        });
    } else {
        console.log(list[0].style.display);
        list.forEach(element => {
            element.style.display = "none";
        });
    }
}

let savePW = document.querySelector(".changePassword");
savePW.onclick = function(){
    let el = document.querySelector(".form-changePassword")
    el.style.display = 'block'
    el.style.top = window.innerHeight/2-60+ 'px'
    el.style.left = window.innerWidth/2-60 +'px'
    console.log(window.innerWidth, window.innerHeight)
    document.querySelector('.person-body').style.opacity = 0.2
    document.querySelector('.person-body').style.pointerEvents = 'none';
}
let savePN = document.querySelector(".changePhoneNumber")
savePN.onclick = function(){
    let el = document.querySelector(".form-changePhoneNumber")
    el.style.display = 'block'
    el.style.top = window.innerHeight/2-60+ 'px'
    el.style.left = window.innerWidth/2-60 +'px'
    console.log(window.innerWidth, window.innerHeight)
    document.querySelector('.person-body').style.opacity = 0.2
    document.querySelector('.person-body').style.pointerEvents = 'none';
}