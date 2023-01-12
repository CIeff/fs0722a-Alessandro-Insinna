import { Directive, Input, TemplateRef, ViewContainerRef } from '@angular/core';

@Directive({
  selector: '[appComparsa]'
})
export class ComparsaDirective {

  constructor(private tRef:TemplateRef<any>, private cRef:ViewContainerRef) { }

  @Input() set appComparsa(variabile:boolean){
    if(!variabile){
      this.cRef.createEmbeddedView(this.tRef);
    }else{
      this.cRef.clear();
    }
  }

}
