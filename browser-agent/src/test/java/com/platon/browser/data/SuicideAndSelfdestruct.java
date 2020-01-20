package com.platon.browser.data;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.7.5.0.
 */
public class SuicideAndSelfdestruct extends Contract {
    private static final String BINARY = "60806040526000805534801561001457600080fd5b5033600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506101e8806100656000396000f3fe608060405260043610610057576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806341c0e1b51461005c578063a87d942c14610073578063d09de08a1461009e575b600080fd5b34801561006857600080fd5b506100716100b5565b005b34801561007f57600080fd5b50610088610148565b6040518082815260200191505060405180910390f35b3480156100aa57600080fd5b506100b3610151565b005b3373ffffffffffffffffffffffffffffffffffffffff16600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141561014657600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16ff5b565b60008054905090565b6000600a90503373ffffffffffffffffffffffffffffffffffffffff16600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614156101b95780600054016000819055505b5056fea165627a7a723058208d499cf4528ad08ca1b7211776354c95ab0192cc5a7c26eb741b17cff72932750029";

    public static final String FUNC_KILL = "kill";

    public static final String FUNC_GETCOUNT = "getCount";

    public static final String FUNC_INCREMENT = "increment";

    @Deprecated
    protected SuicideAndSelfdestruct(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SuicideAndSelfdestruct(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected SuicideAndSelfdestruct(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected SuicideAndSelfdestruct(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> kill() {
        final Function function = new Function(
                FUNC_KILL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getCount() {
        final Function function = new Function(FUNC_GETCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> increment() {
        final Function function = new Function(
                FUNC_INCREMENT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<SuicideAndSelfdestruct> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(SuicideAndSelfdestruct.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<SuicideAndSelfdestruct> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(SuicideAndSelfdestruct.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<SuicideAndSelfdestruct> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(SuicideAndSelfdestruct.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<SuicideAndSelfdestruct> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(SuicideAndSelfdestruct.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static SuicideAndSelfdestruct load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SuicideAndSelfdestruct(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static SuicideAndSelfdestruct load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SuicideAndSelfdestruct(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static SuicideAndSelfdestruct load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new SuicideAndSelfdestruct(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SuicideAndSelfdestruct load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new SuicideAndSelfdestruct(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}