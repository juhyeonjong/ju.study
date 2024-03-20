import React,{ useRef,useState} from "react";

const boardList = [{
    bno : 1,
    btitle : '첫번째 게시글 제목',
    bwriter: '홍길동',
    brdate : '2024-03-15',
    bhit : 10,
    bcontent:'첫번째 게시글 내용'
  },{
    bno : 2,
    btitle : '두번째 게시글 제목',
    bwriter: '고길동',
    brdate : '2024-03-15',
    bhit : 10,
    bcontent:'두번째 게시글 내용'
  },{
    bno : 3,
    btitle : '세번째 게시글 제목',
    bwriter: '이길동',
    brdate : '2024-03-15',
    bhit : 10,
    bcontent:'세번째 게시글 내용'
  },{
    bno : 4,
    btitle : '네번째 게시글 제목',
    bwriter: '홍길동',
    brdate : '2024-03-15',
    bhit : 10,
    bcontent:'네번째 게시글 내용'
  },{
    bno : 5,
    btitle : '다섯번째 게시글 제목',
    bwriter: '고길동',
    brdate : '2024-03-15',
    bhit : 10,
    bcontent:'다섯번째 게시글 내용'
  }]

  
function ListEx(props){

    const menuInput = useRef(null);
    const [menuState,setMenuState] =  useState(boardList);
  
  
    function addMenuFn(){
      const bno = menuInput.current.value;
      setMenuState([...menuState,bno]);
    }

    return (
<>
        제목 : <input type="text" ref={menuInput} /><br/>
        <button onClick={addMenuFn}>추가</button>

        <table border={1}>
                <thead>
                    <tr>
                        <th>글번호</th>
                        <th>글제목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                    </tr>
                </thead>
                <tbody>
                    {boardList.map(function(item){
                        return <tr key={item}>
                                    <td>{item.bno}</td>
                                    <td>{item.btitle}</td>
                                    <td>{item.bwriter}</td>
                                    <td>{item.brdate}</td>
                              </tr>
                    })}
                </tbody>
        </table>
</>
    );
}

export default ListEx;