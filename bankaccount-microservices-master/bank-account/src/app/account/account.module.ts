import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { accountRoutes } from './account.routes';
import { AddNewAccountComponent } from './add-account.component';
import { HttpClientModule } from "@angular/common/http";

@NgModule({
    declarations:[
        AddNewAccountComponent
    ],
    imports:[
        BrowserModule,
        RouterModule.forChild(accountRoutes),
        HttpClientModule
        
    ],
    exports:[
        AddNewAccountComponent,
        RouterModule
    ]
})
export class AccountModule{

}