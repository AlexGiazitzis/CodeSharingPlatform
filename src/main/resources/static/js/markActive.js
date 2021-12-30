switch (window.location.pathname) {
    case "":
    case "/":
        markActive("home");
        break;
    case '/code/load':
        markActive('load');
        break;
    case '/code/latest':
        markActive("latest");
        break;
    case '/code/new':
        markActive("new");
        break;
    case '/docs':
        markActive("docs");
        break;
    case '/about':
        markActive("about");
        break;
    default:
        break;
}

function markActive(id) {
    document.getElementById(id).className += ' active';
}