// src/app/services/course.service.ts
import { Injectable } from '@angular/core';
import { of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  private courses = [
    { id: 1, name: 'Java', price: 5000, imageUrl: 'assets/images/java.png' },
    { id: 2, name: 'C++', price: 4000, imageUrl: 'assets/images/cpp.jpg' },
    { id: 3, name: 'Python', price: 6000, imageUrl: 'assets/images/python.jpg' },
    { id: 4, name: 'JavaScript', price: 0, imageUrl: 'assets/images/javascript.jpg' },
    { id: 5, name: 'HTML & CSS', price: 0, imageUrl: 'assets/images/html_css.jpg' },
    { id: 6, name: 'Data Science', price: 7000, imageUrl: 'assets/images/data_science.jpg' },
    { id: 7, name: 'Machine Learning', price: 8000, imageUrl: 'assets/images/ml.jpg' },
    { id: 8, name: 'React', price: 0, imageUrl: 'assets/images/react.jpg' },
    { id: 9, name: 'Angular', price: 0, imageUrl: 'assets/images/angular.jpg' },
    { id: 10, name: 'Node.js', price: 5000, imageUrl: 'assets/images/nodejs.png' }
  ];

  getCourses() {
    return of(this.courses);
  }

  subscribeToCourse(courseId: number) {
    return of(`Subscribed to course with ID ${courseId}`);
  }
}


