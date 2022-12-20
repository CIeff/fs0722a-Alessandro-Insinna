// get e set
var Persona = /** @class */ (function () {
    function Persona(nome, cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    Object.defineProperty(Persona.prototype, "nomeCompleto", {
        get: function () {
            return this.nome + ' ' + this.cognome;
        },
        set: function (valore) {
            var parti = valore.toString().split(' ');
            this.nome = parti[0] || '';
            this.cognome = parti[1] || '';
        },
        enumerable: true,
        configurable: true
    });
    return Persona;
}());
var marioRossi = new Persona("Mario", "Rossi");
console.log(marioRossi.nomeCompleto);
marioRossi.nomeCompleto = 'Giuseppe Verdi';
console.log(marioRossi.nomeCompleto);
console.log(marioRossi.nome);
console.log(marioRossi.cognome);
