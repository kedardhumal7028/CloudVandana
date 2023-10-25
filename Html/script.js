// Get all the buttons and the result input element
const buttons = document.querySelectorAll('input[type="button"]');
const resultInput = document.querySelector('.result');

// Add an event listener to each button
buttons.forEach(button => {
  button.addEventListener('click', () => {
    const value = button.value;

    if (value === '=') {
      // Evaluate the expression
      try {
        resultInput.value = eval(resultInput.value);
      } catch (error) {
        resultInput.value = 'Error';
      }
    } else if (value === 'AC') {
      // Clear the input
      resultInput.value = '';
    } else {
      // Append the value to the input
      resultInput.value += value;
    }
  });
});
