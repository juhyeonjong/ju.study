import Box from './Box.js';


let num1 = 10;
let num2 = 20;

function App() {
  return (
    <>
      <h2>Hello,React!!</h2>
      <div>
        안녕하세요,리액트는 처음이에요!
      </div>
      <div>
        {num1}+{num2} = {num1+num2}<br></br>
        작은 수는? {num1<num2? num1 : num2}
      </div>
      <div>
        {num1 > 5&&  '5보다 num1은 크다'}
      </div>
      <div>
        {undefined}
      </div>
      <Box/>
    </>
  );
}

export default App;
