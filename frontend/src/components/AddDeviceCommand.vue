<template>
    <v-card outlined>
        <v-card-title>
            AddDevice
        </v-card-title>

        <v-card-text>
            <Number label="DeviceId" v-model="value.deviceId" :editMode="editMode"/>
            <String label="Imei" v-model="value.imei" :editMode="editMode"/>
            <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
            <Date label="UpdatedAt" v-model="value.updatedAt" :editMode="editMode"/>
            <Date label="CreatedAt" v-model="value.createdAt" :editMode="editMode"/>
            <Status offline label="Status" v-model="value.status" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="addDevice"
            >
                AddDevice
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
        name: 'AddDeviceCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.deviceId = 0;
            this.value.imei = '';
            this.value.userId = 0;
            this.value.updatedAt = '2025-03-07';
            this.value.createdAt = '2025-03-07';
            this.value.status = {};
        },
        watch: {
        },
        methods: {
            addDevice() {
                this.$emit('addDevice', this.value);
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

