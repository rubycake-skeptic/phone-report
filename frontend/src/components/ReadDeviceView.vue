<template>

    <v-data-table
        :headers="headers"
        :items="readDevice"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ReadDeviceView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "deviceId", value: "deviceId" },
            ],
            readDevice : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/readDevices'))

            temp.data._embedded.readDevices.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.readDevice = temp.data._embedded.readDevices;
        },
        methods: {
        }
    }
</script>

