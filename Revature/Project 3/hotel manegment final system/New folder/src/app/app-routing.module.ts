import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddMoneyToWalletComponent } from './components/add-money-to-wallet/add-money-to-wallet.component';
import { HomeComponent } from './components/home/home.component';
import { WalletComponent } from './components/wallet/wallet.component';

const routes: Routes = [
  {path:'wallet',component:WalletComponent},
  {  path:'',component:HomeComponent  },
  {path:'addMoneyToWallet',component:AddMoneyToWalletComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
