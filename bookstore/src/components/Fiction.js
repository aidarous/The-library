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
                <section>
                <h1>Books to donate</h1>
                <form>
                    <input type="text" id="title"  placeholder=" Book title "/>
                    <input type="text"  id="author" placeholder=" author  "/>
                    <input type="text" id="genre" placeholder="genre" />
                    <input className="btn" type="submit" value="Donate"/>
                </form>
            </section>
                <h1>Our collection</h1>
                <p>{this.state.fictionList}</p>
            </div>
        )
    }
}
