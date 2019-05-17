import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ResourceNotFoundComponent } from './notfound.component';
import { RouterModule } from '@angular/router';
import { appRouter } from './app.routes';
import { WelcomeComponent } from './welcome.component';
import { AccountModule } from './account/account.module';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    ResourceNotFoundComponent
  ],
  imports: [
    BrowserModule,
    AccountModule,
    RouterModule.forRoot(appRouter)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
