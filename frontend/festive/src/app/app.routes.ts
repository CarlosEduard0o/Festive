import { Routes } from '@angular/router';
import { MainComponent } from './pages/main/main.component';


export const routes: Routes = [

   {
        path: '',
        component: MainComponent,
    },


    // {
    //     path: 'account/sign-in',
    //     //Colocar o componente SigIn
    // },
    // {
    //     path: 'account/sign-up',
    //     //Colocar o componente SigUp
    // },
    // {
    //     path: '',
    //     component: AppComponent,
    //     // canActivate: [authenticationGuard],
    //     children: [
    //      {
    //        path: '',
    //     //    component: HomeComponent,
    //       },
    //       {
    //         path: 'help',
    //         // component: HelpComponent,
    //       },
    //       {
    //         path: 'account/my-profile',
    //         // component: MyProfileComponent,
    //       },
    //       {
    //        path: 'product',
    //        children: [
    //          {
    //            path: 'create',
    //         //    component: ProductCreateComponent,
    //          },
    //          {
    //            path: 'list',
    //         //    component: ProductListComponent,
    //          },
    //          {
    //            path: 'edit/:id',
    //         //    component: ProductEditComponent,
    //          },
    //          {
    //           path: 'detail/:id',
    //         //   component: ProductDetailComponent,
    //          },
    //        ], 
    //       },
    //       {
    //        path: '**',
    //     //    component: NotFoundComponent,
    //       }
    //     ]
    //    },
];
