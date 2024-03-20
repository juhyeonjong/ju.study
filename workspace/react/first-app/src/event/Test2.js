import React, {useState} from "react";

function Test2(props){

    const [data, setData] = useState("사과1번");

    function aa(e){
            const value = e.target.value;
            setData(value);
    }

    return(
        <div>
            <select onChange={(event) => {aa(event);}}> 
                <option>사과</option>
                <option>바나나</option>
                <option>망고</option>
            </select>
            <div>
                {data}
            </div>
        </div>
    );
}
export default Test2