import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecondoAComponent } from './secondo-a.component';

describe('SecondoAComponent', () => {
  let component: SecondoAComponent;
  let fixture: ComponentFixture<SecondoAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SecondoAComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SecondoAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
