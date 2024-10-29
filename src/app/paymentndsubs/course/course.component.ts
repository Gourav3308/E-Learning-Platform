import { Component, OnInit } from '@angular/core';
import { CourseService } from '../../course.service';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-course',
  standalone: true,
  imports: [CommonModule,RouterLink],
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.css']
})
export class CourseComponent implements OnInit {
  courses: any[] = [];
  allCourses: any[] = [];

  constructor(private courseService: CourseService) {}

  ngOnInit(): void {
    this.courseService.getCourses().subscribe((data) => {
      this.allCourses = data; // Store all courses
      this.courses = data; // Default to show all courses
    });
  }

  showAllCourses(): void {
    this.courses = this.allCourses; // Show all courses
  }

  subscribe(courseId: number): void {
    this.courseService.subscribeToCourse(courseId).subscribe((response) => {
      console.log(response);
      // Optionally show a success message to the user
    });
  }
}
