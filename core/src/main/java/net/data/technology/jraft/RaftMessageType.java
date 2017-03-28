/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  The ASF licenses 
 * this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.data.technology.jraft;

public enum RaftMessageType {

    RequestVoteRequest {
        @Override
        public String toString() {
            return "RequestVoteRequest";
        }

        @Override
        public byte toByte() {
            return (byte) 1;
        }
    },
    RequestVoteResponse {
        @Override
        public String toString() {
            return "RequestVoteResponse";
        }

        @Override
        public byte toByte() {
            return (byte) 2;
        }
    },
    AppendEntriesRequest {
        @Override
        public String toString() {
            return "AppendEntriesRequest";
        }

        @Override
        public byte toByte() {
            return (byte) 3;
        }
    },
    AppendEntriesResponse {
        @Override
        public String toString() {
            return "AppendEntriesResponse";
        }

        @Override
        public byte toByte() {
            return (byte) 4;
        }
    },
    ClientRequest {
        @Override
        public String toString() {
            return "ClientRequest";
        }

        @Override
        public byte toByte() {
            return (byte) 5;
        }
    },
    AddServerRequest {
        @Override
        public String toString() {
            return "AddServerRequest";
        }

        @Override
        public byte toByte() {
            return (byte) 6;
        }
    },
    AddServerResponse {
        @Override
        public String toString() {
            return "AddServerResponse";
        }

        @Override
        public byte toByte() {
            return (byte) 7;
        }
    },
    RemoveServerRequest {
        @Override
        public String toString(){
            return "RemoveServerRequest";
        }

        @Override
        public byte toByte(){
            return (byte)8;
        }
    },
    RemoveServerResponse {
        @Override
        public String toString(){
            return "RemoveServerResponse";
        }

        @Override
        public byte toByte(){
            return (byte)9;
        }
    },
    SyncLogRequest {
        @Override
        public String toString(){
            return "SyncLogRequest";
        }

        @Override
        public byte toByte(){
            return (byte)10;
        }
    },
    SyncLogResponse {
        @Override
        public String toString(){
            return "SyncLogResponse";
        }

        @Override
        public byte toByte(){
            return (byte)11;
        }
    },
    JoinClusterRequest {
        @Override
        public String toString(){
            return "JoinClusterRequest";
        }

        @Override
        public byte toByte(){
            return (byte)12;
        }
    },
    JoinClusterResponse {
        @Override
        public String toString(){
            return "JoinClusterResponse";
        }

        @Override
        public byte toByte(){
            return (byte)13;
        }
    },
    LeaveClusterRequest {
        @Override
        public String toString(){
            return "LeaveClusterRequest";
        }

        @Override
        public byte toByte(){
            return (byte)14;
        }
    },
    LeaveClusterResponse {
        @Override
        public String toString(){
            return "LeaveClusterResponse";
        }

        @Override
        public byte toByte(){
            return (byte)15;
        }
    },
    InstallSnapshotRequest {
        @Override
        public String toString(){
            return "InstallSnapshotRequest";
        }

        @Override
        public byte toByte(){
            return (byte)16;
        }
    },
    InstallSnapshotResponse {
        @Override
        public String toString(){
            return "InstallSnapshotResponse";
        }

        @Override
        public byte toByte(){
            return (byte)17;
        }
    },
    QueueCreateRequest {
        @Override
        public String toString(){
            return "QueueCreateRequest";
        }

        @Override
        public byte toByte(){
            return (byte)18;
        }
    },
    QueueCreateResponse {
        @Override
        public String toString(){
            return "QueueCreateResponse";
        }

        @Override
        public byte toByte(){
            return (byte)19;
        }
    },
    QueueAppendEntriesRequest{
        @Override
        public String toString(){
            return "QueueAppendEntriesRequest";
        }

        @Override
        public byte toByte(){
            return (byte)20;
        }
    },
    QueueAppendEntriesResponse{
    	@Override
        public String toString(){
            return "QueueAppendEntriesResponse";
        }

        @Override
        public byte toByte(){
            return (byte)21;
        }
    },
    RetrieveQueueIdRequest{
    	@Override
        public String toString(){
            return "RetrieveQueueIdRequest";
        }

        @Override
        public byte toByte(){
            return (byte)22;
        }    	
    },
    RetrieveQueueIdResponse{
    	@Override
        public String toString(){
            return "RetrieveQueueIdResponse";
        }

        @Override
        public byte toByte(){
            return (byte)23;
        }
    },
    GetQueueIdAppendEntriesRequest{
    	@Override
        public String toString(){
            return "GetQueueIdAppendEntriesRequest";
        }

        @Override
        public byte toByte(){
            return (byte)24;
        }
    	
    },
    GetQueueIdAppendEntriesResponse{
    	@Override
        public String toString(){
            return "GetQueueIdAppendEntriesResponse";
        }

        @Override
        public byte toByte(){
            return (byte)25;
        }
    },
    QueuePushCreateRequest{
    	@Override
        public String toString(){
            return "QueuePushCreateRequest";
        }

        @Override
        public byte toByte(){
            return (byte)26;
        }    	
    },
    QueuePushCreateResponse{
    	@Override
        public String toString(){
            return "QueuePushCreateResponse";
        }

        @Override
        public byte toByte(){
            return (byte)27;
        }
    },
    QueuePushAppendEntriesRequest{
    	@Override
        public String toString(){
            return "QueuePushAppendEntriesRequest";
        }

        @Override
        public byte toByte(){
            return (byte)28;
        }
    	
    },
    QueuePushAppendEntriesResponse{
    	@Override
        public String toString(){
            return "QueuePushAppendEntriesResponse";
        }

        @Override
        public byte toByte(){
            return (byte)29;
        }
    },
    QueuePopCreateRequest{
    	@Override
        public String toString(){
            return "QueuePopCreateRequest";
        }

        @Override
        public byte toByte(){
            return (byte)30;
        }    	
    },
    QueuePopCreateResponse{
    	@Override
        public String toString(){
            return "QueuePopCreateResponse";
        }

        @Override
        public byte toByte(){
            return (byte)31;
        }
    },
    QueuePopAppendEntriesRequest{
    	@Override
        public String toString(){
            return "QueuePopAppendEntriesRequest";
        }

        @Override
        public byte toByte(){
            return (byte)32;
        }
    	
    },
    QueuePopAppendEntriesResponse{
    	@Override
        public String toString(){
            return "QueuePopAppendEntriesResponse";
        }

        @Override
        public byte toByte(){
            return (byte)33;
        }
    },
    QueueTopCreateRequest{
    	@Override
        public String toString(){
            return "QueueTopCreateRequest";
        }

        @Override
        public byte toByte(){
            return (byte)34;
        }    	
    },
    QueueTopCreateResponse{
    	@Override
        public String toString(){
            return "QueueTopCreateResponse";
        }

        @Override
        public byte toByte(){
            return (byte)35;
        }
    },
    QueueTopAppendEntriesRequest{
    	@Override
        public String toString(){
            return "QueueTopAppendEntriesRequest";
        }

        @Override
        public byte toByte(){
            return (byte)36;
        }
    	
    },
    QueueTopAppendEntriesResponse{
    	@Override
        public String toString(){
            return "QueueTopAppendEntriesResponse";
        }

        @Override
        public byte toByte(){
            return (byte)37;
        }
    },
    QueueSizeCreateRequest{
    	@Override
        public String toString(){
            return "QueueSizeCreateRequest";
        }

        @Override
        public byte toByte(){
            return (byte)38;
        }    	
    },
    QueueSizeCreateResponse{
    	@Override
        public String toString(){
            return "QueueSizeCreateResponse";
        }

        @Override
        public byte toByte(){
            return (byte)39;
        }
    },
    QueueSizeAppendEntriesRequest{
    	@Override
        public String toString(){
            return "QueueSizeAppendEntriesRequest";
        }

        @Override
        public byte toByte(){
            return (byte)40;
        }
    	
    },
    QueueSizeAppendEntriesResponse{
    	@Override
        public String toString(){
            return "QueuePushAppendEntriesResponse";
        }

        @Override
        public byte toByte(){
            return (byte)41;
        }
    };
    

    public abstract byte toByte();

    public static RaftMessageType fromByte(byte value) {
        switch (value) {
        case 1:
            return RequestVoteRequest;
        case 2:
            return RequestVoteResponse;
        case 3:
            return AppendEntriesRequest;
        case 4:
            return AppendEntriesResponse;
        case 5:
            return ClientRequest;
        case 6:
            return AddServerRequest;
        case 7:
            return AddServerResponse;
        case 8:
            return RemoveServerRequest;
        case 9:
            return RemoveServerResponse;
        case 10:
            return SyncLogRequest;
        case 11:
            return SyncLogResponse;
        case 12:
            return JoinClusterRequest;
        case 13:
            return JoinClusterResponse;
        case 14:
            return LeaveClusterRequest;
        case 15:
            return LeaveClusterResponse;
        case 16:
            return InstallSnapshotRequest;
        case 17:
            return InstallSnapshotResponse;
        case 18:
        	return QueueCreateRequest;
        case 19:
        	return QueueCreateResponse;
        case 20:
        	return QueueAppendEntriesRequest;
        case 21:
        	return QueueAppendEntriesResponse;
        case 22:
        	return RetrieveQueueIdRequest;
        case 23:
        	return RetrieveQueueIdResponse;
        case 24:
        	return GetQueueIdAppendEntriesRequest;
        case 25:
        	return GetQueueIdAppendEntriesResponse;
        case 26:
        	return QueuePushCreateRequest;
        case 27:
        	return QueuePushCreateResponse;
        case 28:
        	return QueuePushAppendEntriesRequest;
        case 29:
        	return QueuePushAppendEntriesResponse;
        case 30:
        	return QueuePopCreateRequest;
        case 31:
        	return QueuePopCreateResponse;
        case 32:
    		return QueuePopAppendEntriesRequest;
        case 33:
        	return QueuePopAppendEntriesResponse;
        case 34:
        	return QueueTopCreateRequest;
        case 35:
    		return QueueTopCreateResponse;
        case 36:
        	return QueueTopAppendEntriesRequest;
        case 37:
        	return QueueTopAppendEntriesResponse;        	
        case 38:
        	return QueueSizeCreateRequest;
        case 39:
        	return QueueSizeCreateResponse;
        case 40:
        	return QueueSizeAppendEntriesRequest;
        case 41:
        	return QueueSizeAppendEntriesResponse;
        }

        throw new IllegalArgumentException("the value for the message type is not defined");
    }
}