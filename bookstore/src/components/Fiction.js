import React, { Component } from 'react'
import axios from 'axios';

export default class Fiction extends Component {
    constructor(props){
        super(props);

        this.state = {

        }
    }
        async getBooks(){
            try{
            const res = await axios.get('http://localhost:8080/book/list');
            const bookList = res.data[0].title;
            console.log(bookList)
            this.setState({
                fictionList: bookList
            })
            } catch(e) {
                console.error(e, e.message);
            }
            
        }
        componentDidMount() {
            this.getBooks()
        }
    render() {
        return (
            <div>
                <p>{this.state.fictionList}</p>
            </div>
        )
    }
}
