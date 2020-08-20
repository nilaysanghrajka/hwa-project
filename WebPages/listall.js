fetch("http://localhost:8701/Groups/ListOfHeroes", {
  method: "GET",
})
  .then(function (response) {
    if (response.status !== 200) {
      console.log(
        "Looks like there was a problem. Status Code: " + response.status
      );
      return;
    }
    // Examine the text in the response
    response.json().then(function (data) {
      console.log(data);
      for (let i = 0; i < data.length; i++) {
        console.log("ID", data[i].regno);
        console.log("Name", data[i].name);
        console.log("Address", data[i].address);

        let row = `<tr><th scope="row">${data[i].regno}</th>
        <td>${data[i].name}</td>
        <td>${data[i].address}</td>
        <td><a href="http://localhost:8003/deleterecord/${data[i].regno}">delete</a></td></tr>`;

        document.getElementById("studFriend").innerHTML += row;
      }
    });
  })
  .catch(function (err) {
    console.log("Fetch Error :-s", err);
  });



document.querySelector("#addprod").addEventListener("submit", function (e) {
  e.preventDefault();
  let x = document.querySelector("#addprod").elements;

  let name = x["nameinput"].value;
  let address = parseInt(x["addinput"].value);

  console.log(name);
  console.log(address);

  const data = {
    "name": name,
    "address": address,
  };

  console.log(data);

  //   console.log(JSON.stringify(data));

