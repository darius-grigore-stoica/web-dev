document.addEventListener("DOMContentLoaded", () => {
    let values = [];
    //add a new category into the budget form
    const form = document.getElementById("budget-form");
    const add_category_btn = document.getElementById("add-category");
    add_category_btn.addEventListener("click", () => {
        //get the new category's name
        const new_category = document.getElementById("category").value;
        values.push(new_category);
        //adds a title
        const new_h5 = document.createElement("h5");
        new_h5.innerText = new_category + ": ";
        new_h5.classList = new_category;
        form.appendChild(new_h5);
        //add options
        // const select = document.createElement("select");
        // for(let i = 0; i <= 100; i = i + 10){
        //     let option = document.createElement("option");
        //     option.value = i;
        //     option.innerHTML = i;
        //     select.appendChild(option);
        // }
        // select.className = new_category;
        // //append the new category to the form
        // form.appendChild(select);
        const input = document.createElement("input");
        input.type = "range";
        input.min = "0";
        input.max = "100";
        input.step = "1";
        input.className = new_category;
        const output = document.querySelector(".input-output");
        input.addEventListener("input", () => {
            output.textContent = input.value;
        })
        //append the new category to the form
        form.appendChild(input);
        form.appendChild(document.createElement("br"));
        document.getElementById("category").value = '';
    })
    
    //add the budget cap
    const btn = document.getElementById("submit-btn");
    btn.addEventListener("click", () => {
        let budgetValue = document.getElementById("budget-value").value;
        const results = document.getElementById("results");
        console.log(results);
        for(let index = 0; index < values.length; index++){
            const select = document.getElementsByClassName(values[index]);
            const money = document.createElement("h3");
            money.innerText = values[index] + ": ";
            money.innerText += (select[1].value * budgetValue) / 100 + "$"
            results.appendChild(money);
            results.appendChild(document.createElement("br"));
        }
        const calculator = document.getElementById("calculator");
        const header = document.getElementById("header");
        header.style.display = "none";
        calculator.style.display = "none";
        results.style.display = "block";
    })

})