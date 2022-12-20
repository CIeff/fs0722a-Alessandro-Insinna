// enum ci permettono di definire un insieme di costanti
// le usiamo per ordinare dei dati oppure per creare una serie di casi
enum StatusCodes {
    NotFound = 404,
    Success = 200,
    Accepted = 202,
    BadRequest = 400
}
console.log(StatusCodes.NotFound)
console.log(StatusCodes.Success)

enum CardinalDirections {
    North = 1,
    East,
    South,
    West
}
let currentDirection = CardinalDirections.East;
console.log(currentDirection)