import { NgModule } from '@angular/core';

import { PortailtiSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [PortailtiSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [PortailtiSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class PortailtiSharedCommonModule {}
