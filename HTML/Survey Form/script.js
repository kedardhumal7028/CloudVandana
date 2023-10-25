function submitForm() 
{
    event.preventDefault();

    
    let formValid = true;
    const formElements = document.getElementById("surveyForm").elements;
    for (let i = 0; i < formElements.length; i++) 
    {
        if (formElements[i].type !== "submit" && formElements[i].type !== "button") 
        {
            if (formElements[i].value.trim() === "") { 
                formValid = false;
                alert(`Please fill in ${formElements[i].name}`);
                break;
            }
        }
    }

    if (formValid) 
    {
       
        const popup = document.getElementById("popup");
        popup.style.display = "flex";

        const surveyDetails = document.getElementById("surveyDetails");
        surveyDetails.innerHTML = "";
        for (let i = 0; i < formElements.length; i++) 
        {
            if (formElements[i].type !== "submit" && formElements[i].type !== "button") 
            {
                const label = document.querySelector(`label[for="${formElements[i].id}"]`).innerText;
                const value = formElements[i].type === "checkbox" ? formElements[i].checked : formElements[i].value;
                surveyDetails.innerHTML += `<p><strong>${label}:</strong> ${value}</p>`;
            }
        }
    }
}

function closePopup() 
{
    const popup = document.getElementById("popup");
    popup.style.display = "none";
}

function resetForm() 
{
    document.getElementById("surveyForm").reset();
    document.getElementById("popup").style.display = "none";
}
