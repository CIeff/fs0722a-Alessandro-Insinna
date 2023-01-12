import { Directive, ElementRef, HostListener, HostBinding, Input } from '@angular/core';

@Directive({
  selector: '[appColora]'
})
export class ColoraDirective {

  @Input() defaultColor:string="red";
  @Input("appColora")newColor:string="black";

  @HostBinding("style.color")color:string="black";
  @HostBinding("class.active")active:boolean=false;

  @HostListener("mouseenter")mouseEnter(){
    this.color=this.newColor;
    this.active=true;
  }
  @HostListener("mouseleave")mouseLeave(){
    this.color=this.defaultColor;
    this.active=false;
  }

  constructor(private ref:ElementRef) { }

  ngOnInit():void{
    console.log(this.ref)
    this.color=this.defaultColor
  }
}
