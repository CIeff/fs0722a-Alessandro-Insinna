import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecondoBComponent } from './secondo-b.component';

describe('SecondoBComponent', () => {
  let component: SecondoBComponent;
  let fixture: ComponentFixture<SecondoBComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SecondoBComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SecondoBComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
