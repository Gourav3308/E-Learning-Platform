import { Routes } from '@angular/router';
import { CourseComponent } from './paymentndsubs/course/course.component';

export const routes: Routes = [

    { path: 'courses', component: CourseComponent},            // Route for the main courses page
    
    { path: '', redirectTo: '/courses', pathMatch: 'full' }     // Default route redirects to courses



];
