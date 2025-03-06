<template>

    <v-card outlined>
        <v-card-title>
            ReadDevice # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="DeviceId" v-model="item.deviceId" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ReadDeviceViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/readDevices/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

