import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ResourceNotFoundComponent } from './notfound.component';
import { WelcomeComponent } from './welcome.component';


export const appRouter:Routes=[
    {path:"home",component:WelcomeComponent},
    {path:"",component:WelcomeComponent},
    {path:"**",component:ResourceNotFoundComponent}
];