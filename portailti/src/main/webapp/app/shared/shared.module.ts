import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { PortailtiSharedLibsModule, PortailtiSharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [PortailtiSharedLibsModule, PortailtiSharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
    exports: [PortailtiSharedCommonModule, HasAnyAuthorityDirective],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class PortailtiSharedModule {
    static forRoot() {
        return {
            ngModule: PortailtiSharedModule
        };
    }
}
