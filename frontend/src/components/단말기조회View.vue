<template>

    <v-data-table
        :headers="headers"
        :items="단말기조회"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '단말기조회View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "deviceId", value: "deviceId" },
            ],
            단말기조회 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/단말기조회'))

            temp.data._embedded.단말기조회.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.단말기조회 = temp.data._embedded.단말기조회;
        },
        methods: {
        }
    }
</script>

