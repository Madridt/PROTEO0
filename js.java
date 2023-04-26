var images=
["https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2F1997686233620670%2Fposts%2Fgwen-drama-total-ilha-dos-desafios%2F1997764090279551%2F&psig=AOvVaw3ZPZ0o788Z6s4bB9CY-Ez_&ust=1682455210909000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLjsl6Gww_4CFQAAAAAdAAAAABAE",
"https://www.google.com/url?sa=i&url=https%3A%2F%2Faminoapps.com%2Fc%2Fdramatotal%2Fpage%2Fitem%2Fcourtney%2FbNeE_vbmunIXoJzkk1YMvJBzpJ7dWjggQ7l&psig=AOvVaw3fA6GN0IVWkzsraDwmDMMI&ust=1682455239642000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJiQtKyww_4CFQAAAAAdAAAAABAE,https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.planoaberto.com.br%2Fdesventuras-em-serie-inferno-no-colegio-interno-volume-1%2F&psig=AOvVaw3vkKwOQLl_n9LYoShV1aAW&ust=1682455361518000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPCVveaww_4CFQAAAAAdAAAAABAF",
"https://www.google.com/url?sa=i&url=https%3A%2F%2Fsnicket.fandom.com%2Fwiki%2FCategory%3AMales&psig=AOvVaw3vkKwOQLl_n9LYoShV1aAW&ust=1682455361518000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPCVveaww_4CFQAAAAAdAAAAABAZ"
];
var names = ["Álbum de Família", "Gwen", "Beatrice", "Luisa", "Theo"];

var i = 0;
function update()
{
    i++;
    var numbersOfFamilyMemberInArray = 5
    if(i > numbersOfFamilyMemberinArray )
    {
        i = 0;
    }

    var updatedImage = images[i];
    var updatedName = names[i];
    document.getElementById("familyMemberImage").src = updatedImage;
    document.getElementById("familyMemberName").innerHTML = updatedName;
}