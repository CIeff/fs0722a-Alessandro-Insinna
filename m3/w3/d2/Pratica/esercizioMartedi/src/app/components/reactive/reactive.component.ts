import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormArray, Validators } from "@angular/forms";

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.scss']
})
export class ReactiveComponent implements OnInit {

  form!:FormGroup;

  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
    this.form=this.fb.group({
        nome:this.fb.control(null,[Validators.required]),
        alterEgo:this.fb.control(null,[Validators.required]),
        nemico:this.fb.control(null,[Validators.required, Validators.maxLength(10)]),
        pianeta:this.fb.control(null,[Validators.required, Validators.minLength(5)]),
        debolezza:this.fb.array(['']),
        poteri:this.fb.array([''])
      })


    this.form.valueChanges.subscribe(value=>{
      console.log("Reactive (status)",value)
    })

  }

  getElementoForm(name:string){
    return this.form.get(name)
  }

  getElementoErrore(name:string,error:string){
    return this.form.get(name)?.errors![error];
  }

  poteri(){
    return (this.form.get("poteri") as FormArray).controls;
  }

  addPotere(){
    const powah = this.fb.control(null);
    this.poteri().push(powah);
    console.log(this.poteri());
  }

  debolezze(){
    return (this.form.get("debolezza")as FormArray).controls;
  }

  addDebolezza(){
    const debo=this.fb.control(null);
    this.debolezze().push(debo);
    console.log(this.debolezze());
  }

  submit(){
    console.log("form inviato");
    console.log(this.form.value);
    this.form.reset();
    this.poteri().length=1;
    this.debolezze().length=1;
  }

}
