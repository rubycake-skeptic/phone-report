<template>

    <v-card outlined>
        <v-card-title>
            단말기조회 # {{$route.params.id }}
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
    name: '단말기조회ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/단말기조회/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

