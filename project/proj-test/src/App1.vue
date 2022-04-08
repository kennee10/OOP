<template>
  
  <div class="flexbox-container">
    <div class="aliasColumn">
      <h2>Alias Column</h2>
      <!-- 1.1 -->
      <div v-for='alias in aliasList'
      :key='alias'
      class='drag-el'
      draggable="true"
      @dragstart="startDrag($event, alias)"

      @dragover.prevent
      @dragenter.prevent
      >
        {{ alias }}
      <!-- 1.1 -->
      </div>
    </div>

    
    <div class="universalTermsColumn">
      <h2>Universal Terms Column</h2>
      <div v-for='(val, universalTermId) in aliasMapList'
      :key='universalTermId'
      
      >
        {{ val.universalTermName }}
        <div @drop="onDrop($event, universalTermId)"
        class='drop-zone'
        @dragover.prevent
        @dragenter.prevent
        >
          {{ val.aliasName }}
          
        </div>
      </div>
    </div>
  </div>

</template>

<script>
export default {
  data () {
    return {
      aliasToAdd: "",
      aliasList: ["first_name", "last_name", "bank_account_num"],
      universalTermList: [
        {
          "universalTermId": "senderFirstName",
          "universalTermName": "Sender First Name",
          "description": "The first name of the sender"
        },
        {
          "universalTermId": "senderLastName",
          "universalTermName": "Sender Last Name",
          "description": "The last name of the sender"
        },
        {
          "universalTermId": "receiverBankAccountNumber",
          "universalTermName": "Receiver Bank Account Number",
          "description": "Bank account number of the receiver"
        }
      ],
      aliasMapList : {}
    }
  },

  methods: {
    startDrag (evt, alias) {
      console.log(alias)
      evt.dataTransfer.dropEffect = 'move'
      evt.dataTransfer.effectAllowed = 'move'
      evt.dataTransfer.setData('alias', alias)
    },

    onDrop (evt, universalTermId) {
      const currAlias = evt.dataTransfer.getData('alias')

      if (this.aliasMapList[universalTermId]["aliasName"].length === 0) {
        this.aliasMapList[universalTermId]["aliasName"] = currAlias
        const index = this.aliasList.indexOf(currAlias);
        if (index > -1) {
          this.aliasList.splice(index, 1)
        }
      } else {
        this.aliasToAdd = this.aliasMapList[universalTermId]["aliasName"]
        this.aliasMapList[universalTermId]["aliasName"] = currAlias
        const index = this.aliasList.indexOf(currAlias);
        if (index > -1) {
          this.aliasList.splice(index, 1)
        this.aliasList.push(this.aliasToAdd)
        }
      }
    },

    create_aliasMapList(aliasMapList, universalTermList) {
      for (var i = 0; i < universalTermList.length; i++) {
        aliasMapList[universalTermList[i]["universalTermId"]] = {
          "aliasName": "",
          "universalTermName": universalTermList[i]["universalTermName"]
        }
      }
    }
  },

  mounted() {
      this.create_aliasMapList(this.aliasMapList, this.universalTermList)
  }

}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.flexbox-container {
  background-color: #eee;
  padding: 15px;
  

  display: flex;
  justify-content: space-around;
  align-items: stretch;
}

.aliasColumn {
  background-color: aquamarine;
  margin: 10px;
  padding: 10px;

  flex-grow: 1;
}

.universalTermsColumn {
  background-color: pink;
  margin: 10px;
  padding: 10px;

  flex-grow: 2;
}

.drop-zone {
    background-color: #fff;
    margin-bottom: 10px;
    padding: 20px;
}

.drag-el {
  background-color: #fff;
  margin-bottom: 10px;
  padding: 5px;
}
</style>
