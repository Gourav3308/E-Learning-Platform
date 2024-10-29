import { Component } from '@angular/core';
import { AddComponent } from './add/add.component';
import { CourseComponent } from "./paymentndsubs/course/course.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [AddComponent, CourseComponent], // Import AddComponent here
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title(title: any) {
    throw new Error('Method not implemented.');
  }
}
