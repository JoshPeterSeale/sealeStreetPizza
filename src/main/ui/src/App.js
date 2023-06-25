import './App.css';
import Header from './Header.jsx';
import './Header.css'
import LandingContent from './LandingContent';
import ContentSelectorMenu from './ContentSelectorMenu';


function App() {
  return (
    <div className="App">
      <Header title="Seale Street Pizza"/>
      <LandingContent/>
      <ContentSelectorMenu contentList={["Menu", "How to's", "About us"]}></ContentSelectorMenu>
      <div className="App-content"/>
    </div>
  );
}

export default App;