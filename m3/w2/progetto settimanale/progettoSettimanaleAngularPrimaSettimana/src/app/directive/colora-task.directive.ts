import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appColoraTask]'
})
export class ColoraTaskDirective {

  constructor(private ref:ElementRef, private render:Renderer2) {
    render.setStyle(ref.nativeElement,"backgroundColor","lightgreen")
  }

}
