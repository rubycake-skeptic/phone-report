<template>
    <v-card outlined>
        <v-card-title>
            ReportDevice
        </v-card-title>

        <v-card-text>
            <Number label="ReportId" v-model="value.reportId" :editMode="editMode"/>
            <String label="Imei" v-model="value.imei" :editMode="editMode"/>
            <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="Status" v-model="value.status" :editMode="editMode"/>
            <Number label="ReviewerId" v-model="value.reviewerId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="reportDevice"
            >
                ReportDevice
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ReportDeviceCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.reportId = 0;
            this.value.imei = '';
            this.value.userId = 0;
            this.value.status = '';
            this.value.reviewerId = 0;
        },
        watch: {
        },
        methods: {
            reportDevice() {
                this.$emit('reportDevice', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

