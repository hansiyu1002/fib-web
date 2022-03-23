class MainPage extends React.Component {
    constructor() {
        super();
        this.state = {
            fibonacci: [],
            sorted: []
        }
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(e) {
        e.preventDefault();
        const form = document.forms.getElements;
        fetch("/api/fibonacci", {
            method: "post",
            headers: {
                "Accept": "application/json",
                "Content-Type": "application/json"
            },
            body: JSON.stringify({elements:form.nFib.value})
        }).then(res => {
            this.setState({
                fibonacci: res.fibonacci,
                sorted: res.sorted
            })
        }).catch(function(error) {
            console.log(error)
        })

    }

    render() {
        return (
            <div>
                <form name="getElements" onSubmit={this.handleSubmit}>
                    <input type="number" name="nFib" required />
                    <input type="submit" value="CONFIRM" />
                </form>
                <p>fibonacci: {this.state.fibonacci.toString()}</p>
                <p>sorted fibonacci: {this.state.sorted.toString()}</p>
            </div>
        );
    }
}

ReactDOM.render(<MainPage />, document.getElementById("contents"));