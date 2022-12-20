//enum ci permettono di definire un insieme di costanti
//le usiamo per ordinare dei dati oppure per creare una serie di casi
enum StatusCodes{
    NotFound=404,
    Success=200,
    Accepted=202,
    BadRequest=400
}
console.log(StatusCodes.Success);
console.log(StatusCodes.NotFound);

enum CardinalDirections{
    North,
    East,
    South,
    West,
}

let currentDirection=CardinalDirections.North;
console.log(currentDirection);