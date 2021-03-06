
package com.airhacks.configuration.control;

/**
 *
 * @author airhacks.com
 */
@Host
public class SystemPropertySource implements ConfigurationSource {
    @Override
    public String get(String key, String defaultValue) {
        return System.getProperty(key, defaultValue);
    }
}
