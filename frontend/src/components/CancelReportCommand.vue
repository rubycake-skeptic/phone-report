<template>
    <v-card outlined>
        <v-card-title>
            CancelReport
        </v-card-title>

        <v-card-text>
            <Number label="ReportId" v-model="value.reportId" :editMode="editMode"/>
            <String label="Status" v-model="value.status" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="cancelReport"
            >
                CancelReport
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
        name: 'CancelReportCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.reportId = 0;
            this.value.status = '';
        },
        watch: {
        },
        methods: {
            cancelReport() {
                this.$emit('cancelReport', this.value);
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

