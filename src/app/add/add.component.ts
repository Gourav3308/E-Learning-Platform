import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent {
  result: number | null = null;

  // All functions now accept parameters
  functionCall(one: string, Two: string) {
    const num1 = parseFloat(one);
    const num2 = parseFloat(Two);
    this.result = num1 + num2;
  }

  functionCall2(one: string, Two: string) {
    const num1 = parseFloat(one);
    const num2 = parseFloat(Two);
    this.result = num1 - num2;
  }

  functionCall3(one: string, Two: string) {
    const num1 = parseFloat(one);
    const num2 = parseFloat(Two);
    this.result = num1 * num2;
  }

  functionCall4(one: string, Two: string) {
    const num1 = parseFloat(one);
    const num2 = parseFloat(Two);
    if (num2 !== 0) {
      this.result = num1 / num2;
    } else {
      this.result = null; // or handle divide by zero error
    }
  }
}
